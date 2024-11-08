import { sql } from "@vercel/postgres";

const { rows } = await sql`SELECT * FROM posts;`;
export default async function data(time : number) {
    await new Promise((resolve) => setTimeout(resolve, time));
    return await rows.map(row => row);
}